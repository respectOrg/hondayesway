package cn.yesway.hondayesway.exception.handler;

public class ExceptionHandlerFactory {

	private static BaseExceptionHandler handler;

	private ExceptionHandlerFactory() {

	}

	/**
	 * 返回一个单例的异常处理器
	 * 
	 * @return 异常处理器
	 */
	public static BaseExceptionHandler getHandler() {
		if (handler == null) {
			handler = new MessageExceptionHandler();
			handler.setNextnode(new CommonExceptionHandler());
		}
		return handler;
	}

}
