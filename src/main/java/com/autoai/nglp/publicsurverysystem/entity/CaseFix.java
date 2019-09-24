package com.autoai.nglp.publicsurverysystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Time;

/**
 * @author yanggs.
 * @date 2019/9/24.
 * @TIME 17:36
 * MONTH 九月
 * website ：http://www.mapbar.com/.
 * corporation ：北京图吧科技有限公司
 * projectName publicsurverysystem.
 * packageName com.autoai.nglp.publicsurverysystem.entity.
 * user yanggs.
 */
public class CaseFix {


    /**
     * 主键
     */
    private Long id;
    /**
     * 关键字
     */
    private String keyWords;
    /**
     * 城市名称
     */
    private String city;
    /**
     * 经纬度
     */
    private String location;
    /**
     * 搜索类型 1-普通关键字搜索 2-周边搜索
     */
    private int searchType;
    /**
     * 案例类型 1-高频案例 2-经典案例
     */
    private int caseType;
    /**
     * 四维url
     */
    private String swUrl;
    /**
     * 高德url
     */
    private String gdUrl;
    /**
     * 百度url
     */
    private String bdUrl;
    /**
     * 滴滴url
     */
    private String ddUrl;

    /**
     * 创建时间
     */
    @JsonFormat( timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss" )
    private Time createTime;


    /**
     * 获取 主键
     *
     * @return id 主键
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 关键字
     *
     * @return keyWords 关键字
     */
    public String getKeyWords() {
        return this.keyWords;
    }

    /**
     * 设置 关键字
     *
     * @param keyWords 关键字
     */
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    /**
     * 获取 城市名称
     *
     * @return city 城市名称
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置 城市名称
     *
     * @param city 城市名称
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取 经纬度
     *
     * @return location 经纬度
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * 设置 经纬度
     *
     * @param location 经纬度
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取 搜索类型 1-普通关键字搜索 2-周边搜索
     *
     * @return searchType 搜索类型 1-普通关键字搜索 2-周边搜索
     */
    public int getSearchType() {
        return this.searchType;
    }

    /**
     * 设置 搜索类型 1-普通关键字搜索 2-周边搜索
     *
     * @param searchType 搜索类型 1-普通关键字搜索 2-周边搜索
     */
    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }

    /**
     * 获取 案例类型 1-高频案例 2-经典案例
     *
     * @return caseType 案例类型 1-高频案例 2-经典案例
     */
    public int getCaseType() {
        return this.caseType;
    }

    /**
     * 设置 案例类型 1-高频案例 2-经典案例
     *
     * @param caseType 案例类型 1-高频案例 2-经典案例
     */
    public void setCaseType(int caseType) {
        this.caseType = caseType;
    }

    /**
     * 获取 四维url
     *
     * @return swUrl 四维url
     */
    public String getSwUrl() {
        return this.swUrl;
    }

    /**
     * 设置 四维url
     *
     * @param swUrl 四维url
     */
    public void setSwUrl(String swUrl) {
        this.swUrl = swUrl;
    }

    /**
     * 获取 高德url
     *
     * @return gdUrl 高德url
     */
    public String getGdUrl() {
        return this.gdUrl;
    }

    /**
     * 设置 高德url
     *
     * @param gdUrl 高德url
     */
    public void setGdUrl(String gdUrl) {
        this.gdUrl = gdUrl;
    }

    /**
     * 获取 百度url
     *
     * @return bdUrl 百度url
     */
    public String getBdUrl() {
        return this.bdUrl;
    }

    /**
     * 设置 百度url
     *
     * @param bdUrl 百度url
     */
    public void setBdUrl(String bdUrl) {
        this.bdUrl = bdUrl;
    }

    /**
     * 获取 滴滴url
     *
     * @return ddUrl 滴滴url
     */
    public String getDdUrl() {
        return this.ddUrl;
    }

    /**
     * 设置 滴滴url
     *
     * @param ddUrl 滴滴url
     */
    public void setDdUrl(String ddUrl) {
        this.ddUrl = ddUrl;
    }

    /**
     * 获取 创建时间
     *
     * @return createTime 创建时间
     */
    public Time getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Time createTime) {
        this.createTime = createTime;
    }
}
