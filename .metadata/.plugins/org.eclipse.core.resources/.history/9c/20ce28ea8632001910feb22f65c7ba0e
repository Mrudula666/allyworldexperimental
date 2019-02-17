package com.capgemini.allyworld.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.allyworld.website.entity.Post;
import com.capgemini.allyworld.website.entity.Profile;

@Controller
public class WebsiteController {

	@Autowired
	private RestTemplate restTemplate;

	Profile userProfile;
	static Integer profileId;
	Post post;
	Integer postId;

	@RequestMapping("/")
	public String getHomePage(Model model) {
		model.addAttribute("profile", new Profile());
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> userRegistration(@ModelAttribute Profile profile) {
		System.out.println("inside registration");
		System.out.println("Before" + profile);
		ResponseEntity<Profile> updatedProfile = restTemplate.postForEntity("http://localhost:2013/profiles", profile,
				Profile.class);
		System.out.println("after" + updatedProfile);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView autheticateUser(@ModelAttribute Profile profile) {
		System.out.println("Inside website controller");
		ResponseEntity<Profile> response = restTemplate.postForEntity("http://localhost:2013/profiles/authenticate",
				profile, Profile.class);
		System.out.println(response.getBody());
		userProfile = response.getBody();
		profileId = userProfile.getProfileId();
		return new ModelAndView("home", "message", userProfile);
	}

	@RequestMapping("/profile")
	public ModelAndView userProfilePage() {
		return new ModelAndView("Profile", "message", userProfile);
	}

	@RequestMapping("home")
	public ModelAndView userNewsFeedPage() {
		List<Post> posts = restTemplate.getForObject("http://localhost:8989/posts", List.class);
		return new ModelAndView("PostDetails", "posts", posts);
	}

	@RequestMapping("/updatelikes")
	public String updatelikes(@RequestParam("postId") Integer postId, Model model) {	
		System.out.println("update");
		System.out.println("likeprofileId: " + userProfile.getProfileId());
		ResponseEntity<Post> updatePost = restTemplate.getForEntity("http://localhost:8989/posts/?postId=" + postId,
				Post.class);
		Post updatedPost = updatePost.getBody();
		System.out.println("nEW post object is: " + updatePost);
		System.out.println("nEW post object is: " + updatedPost.getLikes().getLikesProfileId());
		updatedPost.setPostId(postId);
		updatedPost.setProfileId(profileId);
		List<Integer> ExistinglikesProfileId = updatedPost.getLikes().getLikesProfileId();
		System.out.println("before null" + ExistinglikesProfileId);
		if (profileId ==null) {
			updatedPost.getLikes().setLikesProfileId(ExistinglikesProfileId);
		} else {
			ExistinglikesProfileId.add(profileId);
		}
		System.out.println("Existing list" + ExistinglikesProfileId);
		updatedPost.getLikes().setLikesProfileId(ExistinglikesProfileId);
		System.out.println("U post object is: " + updatedPost);

		Integer likes = ExistinglikesProfileId.size();
		updatedPost.getLikes().setLikes(likes);
		System.out.println("size of likes" + updatedPost.getLikes().getLikes());

		restTemplate.put("http://localhost:8989/posts/", updatedPost);
		model.addAttribute("post", updatedPost);
		return "home";
	}

	@RequestMapping("/comment")
	public String updatePost(@RequestParam("postId") Integer postId, @RequestParam("comment") String comment, Model model) {
		System.out.println("likeprofileId: " + userProfile.getProfileId());
		System.out.println(comment);
		ResponseEntity<Post> updatePost = restTemplate.getForEntity("http://localhost:8989/posts/?postId=" + postId,
				Post.class);
		Post updatedPost = updatePost.getBody();
		System.out.println("nEW post object is: " + updatePost);
		System.out.println("nEW post object is: " + updatedPost.getComments().getComment());
		updatedPost.setPostId(postId);
		updatedPost.setProfileId(profileId);
		updatedPost.getComments().setComment(comment);
		List<Integer> ExistingcommentsProfileId = updatedPost.getComments().getCommentProfileId();
		if (profileId == null) {
			updatedPost.getComments().setCommentProfileId(ExistingcommentsProfileId);
		} else {
			ExistingcommentsProfileId.add(profileId);
		}
		System.out.println("Existing list" + ExistingcommentsProfileId);
		updatedPost.getComments().setCommentProfileId(ExistingcommentsProfileId);
		System.out.println("U post object is: " + updatedPost);

		Integer likesComment = ExistingcommentsProfileId.size();
		updatedPost.getComments().setLikes(likesComment);
		System.out.println("size of likescomment" + updatedPost.getComments().getLikes());

		restTemplate.put("http://localhost:8989/posts/", updatedPost);
		model.addAttribute("post", updatedPost);
		return "home";

	}


}
