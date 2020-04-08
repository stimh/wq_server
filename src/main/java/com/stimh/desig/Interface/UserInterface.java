package com.stimh.desig.Interface;

import com.stimh.desig.Entity.DMUSER;
import com.stimh.desig.util.BaseDao;

import java.util.List;


public interface UserInterface extends BaseDao<DMUSER> {
    public List findbyid(int id);
}
