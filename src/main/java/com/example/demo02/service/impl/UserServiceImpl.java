package com.example.demo02.service.impl;

import com.example.demo02.mapper.UserMapper;
import com.example.demo02.model.User;
import com.example.demo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService实现类
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUser() {
    	List<User> list = userMapper.findAll();
    	return list;
    }

    @Override
    public User getUser(Long id) {
    	User user = userMapper.findOne(id);
        return user;
    }

    @Override
    public int createUser(User user) {
    	int cnt = userMapper.insert(user);
    	return cnt;
    }

    @Override
    public int deleteUser(Long id) {
    	int cnt = userMapper.delete(id);
    	return cnt;
    }




    /*@Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }*/
}
