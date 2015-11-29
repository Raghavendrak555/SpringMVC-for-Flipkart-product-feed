package com.enixta.tv.dao;
 
import java.util.List;

import com.enixta.tv.model.Television;
 
public interface TelevisionDAO {
     
    public void saveOrUpdate(Television contact);
     
    public void delete(int contactId);
     
    public Television get(int contactId);
     
    public List<Television> list();
}