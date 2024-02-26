package module7.GooSearchResult;
 class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String[] parts = url.split("//");
        if (parts.length < 2) {
            return "";
        }
        String domain = parts[1];
        parts = domain.split("/");
        return parts[0];
    }
}

