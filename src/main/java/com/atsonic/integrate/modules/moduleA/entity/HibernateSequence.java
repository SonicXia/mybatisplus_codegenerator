package com.atsonic.integrate.modules.moduleA.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sonic
 * @since 2019-02-26
 */
public class HibernateSequence extends Model<HibernateSequence> {

    private static final long serialVersionUID = 1L;

    private Long nextVal;


    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HibernateSequence{" +
        ", nextVal=" + nextVal +
        "}";
    }
}
