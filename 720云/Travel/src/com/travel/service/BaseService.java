package com.travel.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.abel533.entity.Example;
import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public abstract class BaseService<T> {
   //使用spring4的泛型注入
    @Autowired
    private Mapper<T> mapper;
   /* //由于具体Mapper 的父接口不能被spring注入，所以由子类进行实现，在子类中能够注入；
    public abstract Mapper<T> getMapper();*/
    /**
     * 根据主键查询一条数据
     * @param id
     * @return
     */
    public T queryById(Long id){
        return this.mapper.selectByPrimaryKey(id);
    }
    public List<T> queryAll(){
        //没有参数的查询就是查询全部
        return this.mapper.select(null);
    }
    /**
     * 根据条件查询一条数据，如果根据该条件所查询出的数据为多条，会抛出异常
     * record 是T的一个实例，也就是一条记录
     * @param record
     * @return
     */
    public T queryOne(T record){
        return this.queryOne(record);
    }
    
   /**
    * 根据条件查询多条数据
    * @param record
    * @return
    */
    public List<T> queryListByWhere(T record){
        return this.mapper.select(record);
    }
    /**
     * 根据条件查询数据并分页
     * @param record
     * @param page页数
     * @param rows每页的条数
     * @return
     */
    public  PageInfo<T> queryPageListByWhere(T record,Integer page,Integer rows){
        //设置分页参数
        PageHelper.startPage(page, rows);
        List<T> list = this.mapper.select(record);
        return new PageInfo<T>(list);
    }
   public Integer save(T t){
       System.out.println("-------------------------");
       return this.mapper.insert(t);
   }
   /**
    * 选择不为空的字段作为插入数据的字段来插入数据，为null不会插入。
    * @param t
    * @return
    */
   public Integer saveSelective(T t){
      
       return this.mapper.insertSelective(t);
   }
   public Integer update(T t){
      
       return this.mapper.updateByPrimaryKey(t);
   }
   public Integer updateSelective(T t){
      
       
       return this.mapper.updateByPrimaryKeySelective(t);
   }
   public Integer deleteById(Long id){
       return this.mapper.deleteByPrimaryKey(id);
   }
   /**
    * 批量删除
    * @param list
    * @return
    */
   public Integer deleteByIds(List<Object> ids,Class<T> clazz,String property){
       Example example = new Example(clazz);
       example.createCriteria().andIn(property, ids);
       return this.mapper.deleteByExample(example);
   }
   /**
    * 根据条件删除数据
    * @param record
    * @return
    */
   public Integer deleteByWhere(T record){
       return this.mapper.delete(record);
   }
}
