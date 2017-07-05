package redis.callback;

public abstract class SessionCallback<T> implements org.springframework.data.redis.core.SessionCallback<T> {

	public abstract String getKey();
	
}
