package com.stimh.desig.Interface.UserInterfaceImpl;

import com.stimh.desig.Entity.DMUSER;
import com.stimh.desig.Interface.UserInterface;
import com.stimh.desig.util.BaseDao;
import com.stimh.desig.util.BaseDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserImpl extends BaseDaoImpl<DMUSER> implements UserInterface  {

    @Resource
    BaseDao<DMUSER> dao;

    @Override
    public List findbyid(int id) {
       List list = dao.findAll();
       return list;
    }
}
