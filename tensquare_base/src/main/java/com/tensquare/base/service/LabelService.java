package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

/**
 * 标签微服务业务层
 */
@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 增
     */
    public void save(Label label) {
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }
    /**
     * 删
     */
    public void deleteById(String labelId) {

        labelDao.deleteById(labelId);
    }
    /**
     * 改
     */
    public void updateById(String labelId, Label label) {
        label.setId(labelId);
        labelDao.save(label);
    }
    /**
     * 查询所有
     */
    public List<Label> findAll() {
        return labelDao.findAll();
    }
    /**
     * 根据id查询
     */
    public Label findById(String labelId) {
        return labelDao.findById(labelId).get();
    }
}
