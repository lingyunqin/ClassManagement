package com.xmu.j2ee.service;

import java.util.ArrayList;
import java.util.List;

import com.xmu.j2ee.entity.Topic;

/**
 * Topic�ķ���ӿ�
 * @author qinlingyun
 *
 */
public interface TopicService {

	List<Topic> topicForm = new ArrayList<Topic>();
	
	TopicService getTopicById(Integer topicId);
	
	

}
