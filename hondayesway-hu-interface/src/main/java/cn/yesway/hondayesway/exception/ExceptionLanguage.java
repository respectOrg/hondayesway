package cn.yesway.hondayesway.exception;

public class ExceptionLanguage {

	// 内部错误
	public static String INTERNAL_ERROR = "Exception.InternalException.internalError";
	// vin过长
	public static String INVALID_PARAM_EXCEPTION_VINTOLONG = "Exception.InvalidParamException.Vintolong";
	// 缺少参数：vin
	public static String INVALID_PARAM_EXCEPTION_MISSINGVIN = "Exception.InvalidParamException.missingVin";
	// vin不存在
	public static String INVALID_PARAM_EXCEPTION_VINNOTEXIST = "Exception.InvalidParamException.VinNotExits";
	// 参数类型错误
	public static String INVALID_PARAM_EXCEPTION_TYPEEROR = "Exception.InvalidParamException.typeError";
	// 必要的参数为空
	public static String INVALID_PARAM_EXCEPTION_NECESSARYPARAMNULL = "Exception.InvalidParamException.necessaryParamNull";
	// 新建用户错误
	public static String USER_NEW_ERROR = "Exception.UserNewException.userNewError";
	// 用户修改错误
	public static String USER_EDITE_RROR = "Exception.UserEditeException.userEditError";
	// 用户激活错误
	public static String USER_ACTIVE_ERROR_MULTIPLE = "Exception.UserActiveException.userActiveErrorMultiple";
	// 同步用户错误 - 所填电话已被使用，请更换其它电话再试
	public static String USER_SYNC_ERROR_EXISTPHONE = "Exception.UserSyncExistPhoneException.userNotSync";
	// 添加位置点 - 用户未同步
	public static String POSITION_INSERT_ERROR_NOTSYNC = "Exception.PositionNotSyncException.userNotSync";
	// 保存位置点失败
	public static String LOCATION_SAVE_FAIL = "Exception.LocationSaveException.locationSavefail";
	// 查无结果
	public static String SELECT_EXCEPTION_NOROWS = "Exception.SelectException.noRows";
	// 消息头不完整
	public static String REQUEST_EXCEPTION_REQUEST_HEADER_INCOMPLETE = "Exception.RequestHeaderException.requestHeaderIncomplete";
	// 未找到服务所关联的计费策略
	public static String NOT_FIND_ASSOCIATE_SERVICE_POLICY = "Exception.ServiceAssociatePolicyException.notFindAssociateServicePolicy";
	// 未找到服务所关联的免费体验套餐
	public static String NOT_FIND_ASSOCIATE_SERVICE_PACKAGES = "Exception.ServiceAssociatePackagesException.notFindAssociateServicePackages";

}
