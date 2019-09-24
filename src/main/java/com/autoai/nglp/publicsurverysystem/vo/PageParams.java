package com.autoai.nglp.publicsurverysystem.vo;

import com.autoai.nglp.publicsurverysystem.util.CheckUtils;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author yanggs.
 * @date 2019/9/24.
 * @TIME 14:20
 * MONTH 九月
 * website ：http://www.mapbar.com/.
 * corporation ：北京图吧科技有限公司
 * projectName publicsurverysystem.
 * packageName com.autoai.nglp.publicsurverysystem.vo.
 * user yanggs.
 */
@ToString
public class PageParams implements Serializable {

    private static final long serialVersionUID = -9034770752474469907L;
    private Integer pageNum;
    private Integer currentNum;
    private Integer pageSize;
    private Integer total;
    private Integer desc;

    public Integer getPageNum() {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if (CheckUtils.intValid(pageNum)) {
            this.pageNum = pageNum;
        }
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize <= 0) {
            pageSize = 10;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (CheckUtils.intValid(pageSize)) {
            this.pageSize = pageSize;
        }
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDesc() {
        return desc;
    }

    public void setDesc(Integer desc) {
        this.desc = desc;
    }



}
