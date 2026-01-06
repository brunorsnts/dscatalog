package com.brunosantos.dscatalog.services;

import com.brunosantos.dscatalog.dto.CategoryDTO;
import com.brunosantos.dscatalog.entities.Category;
import com.brunosantos.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll(;
        return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}
