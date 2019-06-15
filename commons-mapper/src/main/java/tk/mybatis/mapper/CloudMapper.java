package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自定义 Mapper，不能被扫描到
 * @param <T>
 */
public interface CloudMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
