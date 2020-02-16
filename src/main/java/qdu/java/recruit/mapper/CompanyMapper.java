package qdu.java.recruit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import qdu.java.recruit.entity.CompanyEntity;
import qdu.java.recruit.pojo.PositionCompanyBO;

/**
 * <p>
 *       private int companyId;
 private String companyName;
 private int companyLogo;
 private String description;
 private int state;
 private String companyCode;
 * </p>
 */
public interface CompanyMapper {
	

    @Select("select * from company where companyId = #{comId}")
    CompanyEntity getCompanyById(@Param("comId") int comId);

    @Select("select * from company where companyCode = #{companyCode}")
    CompanyEntity getCompanyByCode(@Param("companyCode") String companyCode);

    @Insert({"insert into user(companyName,companyLogo,description,state,companyCode})"
            +"values(#{companyName},#{companyLogo},#{description},#{state},#{companyCode})"})
    int saveCompany(CompanyEntity companyEntity);

    @Select("select * from company")
	List<CompanyEntity> listPosAll();

//    @Update("update company set companyCode = #{companyCode} where companyId = #{companyId}")
//    int updateCompany(int companyCode,int companyId);
}
