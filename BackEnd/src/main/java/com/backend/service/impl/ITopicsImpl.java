package com.backend.service.impl;

import com.backend.model.Articles;
import com.backend.model.Topics;
import com.backend.repository.IArticlesRepo;
import com.backend.repository.IGenericRepo;
import com.backend.repository.ITopicRepo;
import com.backend.service.IArticle;
import com.backend.service.ITopics;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ITopicsImpl extends CrudImpl<Topics, Integer> implements ITopics {

    private final ITopicRepo repo;

    @Override
    protected IGenericRepo<Topics, Integer> getRepo() {
        return repo;
    }
}
