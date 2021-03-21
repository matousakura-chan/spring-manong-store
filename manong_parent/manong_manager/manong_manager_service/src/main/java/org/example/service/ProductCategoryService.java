package org.example.service;

import org.example.pojo.EasyUITree;

import java.util.List;

public interface ProductCategoryService {

    List<EasyUITree> findProductCategoryListParentId(Short parentId);
}
