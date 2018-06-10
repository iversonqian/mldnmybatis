package cn.mldn.util.cache;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.objenesis.Objenesis;
import org.springframework.objenesis.ObjenesisStd;

import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.Schema;

public class ProtostuffRedisSerializer implements RedisSerializer<Object> {
	 private static Objenesis objenesis = new ObjenesisStd(true);
	@Override
	public byte[] serialize(Object t) throws SerializationException {
		// TODO Auto-generated method stub
		return SerializationUtil.serializeToByte(t);
	}

	@Override
	public String deserialize(byte[] bytes) throws SerializationException {
		return (bytes == null ? null : new String(bytes));
	}

}
