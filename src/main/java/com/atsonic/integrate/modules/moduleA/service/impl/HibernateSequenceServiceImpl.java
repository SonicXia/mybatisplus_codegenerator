package com.atsonic.integrate.modules.moduleA.service.impl;

import com.atsonic.integrate.modules.moduleA.entity.HibernateSequence;
import com.atsonic.integrate.modules.moduleA.dao.HibernateSequenceMapper;
import com.atsonic.integrate.modules.moduleA.service.HibernateSequenceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Sonic
 * @since 2019-02-26
 */
@Service
public class HibernateSequenceServiceImpl extends ServiceImpl<HibernateSequenceMapper, HibernateSequence> implements HibernateSequenceService {

}
