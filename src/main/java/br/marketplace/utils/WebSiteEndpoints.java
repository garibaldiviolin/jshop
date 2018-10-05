package br.marketplace.utils;

public final class WebSiteEndpoints {

    public static final String BASE_URL = "/";

    public static final String INDEX = BASE_URL;

    public static final String MANAGER_INDEX = "/manager";

    public static final String CATEGORY_INDEX = MANAGER_INDEX + "/category";

    public static final String CATEGORY_ADD = CATEGORY_INDEX + "/add";
    public static final String CATEGORY_EDIT = CATEGORY_INDEX + "/edit/{id}";
    public static final String CATEGORY_DELETE = CATEGORY_INDEX + "/delete/{id}";
    public static final String CATEGORY_SAVE = CATEGORY_INDEX + "/save";

}
