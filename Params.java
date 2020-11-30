package advisor.config;

public class Params {

    public static final String CLIENT_ID = "098fa45b0b314d12a242bde2fa3527a4";
    public static final String CLIENT_SECRET = "8c64dd9069394876876792d5fc35d625";
    public static final String AUTHORIZE_PART = "/authorize";
    public static final String RESPONSE_TYPE = "code";
    public static final String TOKEN_PART = "/api/token";
    public static final String GRANT_TYPE = "authorization_code";
    public static final String ACCESS_SERVER = "https://accounts.spotify.com";
    public static final String RESOURCE_SERVER = "https://api.spotify.com";
    public static final String NEW_RELEASES= "/v1/browse/new-releases";
    public static final String MAKING_HTTP_REQUEST_FOR_TOKEN= "making http request for access_token...";
    public static final String FEATURED_PLAYLISTS= "/v1/browse/featured-playlists";
    public static final String CATEGORIES = "/v1/browse/categories";
    public static final String PLAYLISTS= "/playlists";
    public static final String REDIRECT_URI = "http://localhost:8080";
    public static final String SUCCESS = "---SUCCESS---";
    public static final String ANSWER_DENIED_ACCESS = "Please, provide access for application.";
    public static final String UNKNOWN_CATEGORY_NAME = "Unknown category name.";
    public static final String GOODBYE = "---GOODBYE!---";
    public static final String INCORRECT_COMMAND = "Incorrect command. Try again.";
    public static final String NO_MORE_PAGES = "No more pages.";
    public static String AUTH_CODE = "";
    public static String TOKEN_CODE = "";
    public static int RESULTS_PER_PAGE = 5;
    
}
