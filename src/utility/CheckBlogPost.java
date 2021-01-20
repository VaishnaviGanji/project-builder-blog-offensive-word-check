package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	String[] offensiveWords = {"ass", "bastard", "fuck", "anal", 
			"asshole", "bondage","boned", "boner", "boners", "bong", 
			"boob","boobies", "boobs", "booby", "booger", "douche"
			, "douchebag", "douchebags", "douche-fag", "douchewaffle"
			, "douchey", "drunk", "dumbass"	, "dumb", "bitch"};
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
//		boolean hasOffensive = false;
		String title = blog.getBlogTitle().toLowerCase();
		for (String word : offensiveWords) {
			if (title.contains(word)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String title = blog.getBlogDescription().toLowerCase();
		for (String word : offensiveWords) {
			if (title.contains(word)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		return checkBlogTitle(blog) && checkBlogDescription(blog);
	}
	
}