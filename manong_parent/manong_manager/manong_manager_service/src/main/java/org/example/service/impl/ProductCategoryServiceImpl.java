package org.example.service.impl;

import org.example.mapper.ProductCategoryMapper;
import org.example.pojo.EasyUITree;
import org.example.pojo.ProductCategory;
import org.example.pojo.ProductCategoryExample;
import org.example.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Override
    public List<EasyUITree> findProductCategoryListParentId(Short parentId) {
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(productCategoryExample);
        List<EasyUITree> easyUITrees = new ArrayList<>(productCategoryList.size());

        for (ProductCategory productCategory : productCategoryList) {
            EasyUITree easyUITree = new EasyUITree();

            easyUITree.setId(productCategory.getId());
            easyUITree.setText(productCategory.getName());
            easyUITree.setState(productCategory.getParentId() == 0 ? "closed" : "open");
            easyUITrees.add(easyUITree);
        }
        return easyUITrees;
    }
}
