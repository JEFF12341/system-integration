package mongodb.source;

/**
 * mongodb动态数据源选择器
 * 
 * @author wangshuo
 * 
 */
public class MongoSourceSwitcher {

	private static final ThreadLocal<String> mongoContextHolder = new ThreadLocal<String>();

	public static void setMongoSourceTypeInContext(String mongoSourceType) {
		mongoContextHolder.set(mongoSourceType);
	}

	public static String getMongoSourceType() {
		String mongoSourceType = (String) mongoContextHolder.get();
		return mongoSourceType;
	}

	public static String getMongoSourceTypeFromContext() {
		String mongoSourceType = (String) mongoContextHolder.get();
		return mongoSourceType;
	}

	public static void clearMongoSourceType() {
		mongoContextHolder.remove();
	}
}
