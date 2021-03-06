package org.iflab.wecentermobileandroidrestructure.http;

/**
 * Created by hcjcch on 15/5/17.
 */
public class RelativeUrl {
    public static String AVATAR = "http://we.bistu.edu.cn/uploads/avatar/";//头像文件夹
    public static String USER_LOGIN = "?/api/account/login_process/"; //登录
    public static String HOME_PAGE = "?/api/home/"; //首页
    public static String USER_INFO = "?/api/account/get_userinfo/";//用户信息
    public static String USER_IMG_EDIT = "?/api/account/avatar_upload/";//用户头像修改
    public static String USER_INFORMATION_EDIT = "api/profile_setting.php";//用户信息修改
    public static String USER_INFO_GET_EDIT = "api/profile.php";//用户信息修改前的获取信息
    public static String ATTACHMENT_UPLOAD = "?/api/publish/attach_upload/";//上传附件
    public static String UPLOAD_QUESTION = "?/api/publish/publish_question/";//上传问题
    public static String FOUND = "?/api/explore/";//发现
    public static String PERSONAL_ARTICLE = "api/my_article.php";//个人文章
    public static String PERSONAL_QUESTION = "api/my_question.php";//我的提问列表
    public static String UPLOAD_ANSWER = "?/question/ajax/save_answer_comment/";//发布回答评论
    public static String PERSONAL_ANSWER = "api/my_answer.php";//个人回答
    public static String PERSONAL_TOPIC = "api/my_focus_topic.php";//个人话题
    public static String FOLLOWING = "api/my_focus_user.php";//关注者
    public static String FOLLOWER = "api/my_fans_user.php";//个人粉丝
    public static String ARTICLE_INFO = "?/api/article/article/"; //文章
    public static String QUESTION_INFO = "?/api/question/question/";//问题
    public static String QUESTION_FOUCS = "?/question/ajax/focus/";//关注问题
    public static String QUESTION_ANSWER_INFO = "?/api/question/answer_detail/";
    public static String ANSWER_VOTE = "?/question/ajax/answer_vote/";
    public static String ARTICLE_VOTE = "?/article/ajax/article_vote/";
    public static String ANSWER_COMMENT = "api/answer_comment.php";
    public static String ARTICLE_COMMENT = "?/api/article/comment/";
    public static String PUBLISH_ARTICLE = "?/api/publish/save_comment/";
    public static String PUBLISH_ANSWER = "?/api/publish/save_answer/";//回答问题
    public static String SEARCH = "?/api/search/";  //搜索
}