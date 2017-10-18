package cn.yesway.hondayesway.exception.handler;

import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;

public abstract class BaseExceptionHandler {

	/**
	 * 下一个处理环节
	 */
	private BaseExceptionHandler nextnode;

	protected BaseExceptionHandler() {

	}

	/**
	 * 异常处理抽象方法
	 * 
	 * @param e
	 *            要处理的异常
	 * @return 返回的应答
	 */
	public abstract MessageHeaderResponse process(Exception e);

	public BaseExceptionHandler getNextnode() {
		return nextnode;
	}

	/**
	 * 设置当前异常处理器的下一环节处理器
	 * 
	 * @param nextnode
	 *            下一环节的异常处理器
	 * @return 返回nextnode<br>
	 *         以可以连续setNextnode<br>
	 *         例如: handeler.setNextnode(nextnode1).setNextnode(nextnode2)...;
	 */
	public BaseExceptionHandler setNextnode(BaseExceptionHandler nextnode) {
		this.nextnode = nextnode;
		return nextnode;
	}

}
