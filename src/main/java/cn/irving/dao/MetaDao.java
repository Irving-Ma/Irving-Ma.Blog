package cn.irving.dao;

import cn.irving.dto.MetaDto;
import cn.irving.dto.cond.MetaCond;
import cn.irving.model.MetaDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 项目dao
 * Created by Irving on 2018/4/29.
 */
@Mapper
public interface MetaDao {

    /**
     * 添加项目
     * @param meta
     * @return
     */
    int addMeta(MetaDomain meta);

    /**
     * 删除项目
     * @param mid
     * @return
     */
    int deleteMetaById(@Param("mid") Integer mid);

    /**
     * 更新项目
     * @param meta
     * @return
     */
    int updateMeta(MetaDomain meta);

    /**
     * 根据编号获取项目
     * @param mid
     * @return
     */
    MetaDomain getMetaById(@Param("mid") Integer mid);


    /**
     * 根据条件查询
     * @param metaCond
     * @return
     */
    List<MetaDomain> getMetasByCond(MetaCond metaCond);

    /**
     * 根据类型获取meta数量
     * @param type
     * @return
     */
    Long getMetasCountByType(@Param("type") String type);

    /**
     * 根据sql查询
     * @param paraMap
     * @return
     */
    List<MetaDto> selectFromSql(Map<String, Object> paraMap);

}
