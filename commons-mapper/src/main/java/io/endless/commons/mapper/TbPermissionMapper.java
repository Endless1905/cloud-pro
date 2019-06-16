package io.endless.commons.mapper;

import io.endless.commons.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbPermissionMapper extends Mapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);

}