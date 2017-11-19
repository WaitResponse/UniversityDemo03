package com.gem.qqzone.actions;

import java.util.Map;
import java.util.Set;

import com.gem.qqzone.biz.TopicBiz;
import com.gem.qqzone.biz.impl.TopicBizImpl;
import com.gem.qqzone.biz.UserBiz;
import com.gem.qqzone.biz.impl.UserBizImpl;
import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;
import com.opensymphony.xwork2.ActionContext;

public class IndexAction {

	private UserBiz userBiz = new UserBizImpl();
	private TopicBiz topicBiz = new TopicBizImpl();

	
	public String preIndex() {
		Map<String,Object> session = ActionContext.getContext().getSession();
		User currUser = (User) session.get("currUser");

		Set<User> friends = userBiz.getFriends(currUser);
		currUser.setFriends(friends);

		Set<Topic> topics = topicBiz.getTopics(currUser);
		currUser.setTopics(topics);

		session.put("currUser", currUser); // currUser记录当前登录的用户
		session.put("currFriend", currUser); // currFriend记录当前进入了谁的空间

		return "success";
	}

}
