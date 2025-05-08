package com.datawrapper.model.entity;

public class Pagination {
    private String totalResults;
    private String resultsPerPage;
    private String numPages;
    private String currentPage;
    private String firstOnPage;
    private String lastOnPage;

    // Getters y Setters
    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(String resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public String getNumPages() {
        return numPages;
    }

    public void setNumPages(String numPages) {
        this.numPages = numPages;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getFirstOnPage() {
        return firstOnPage;
    }

    public void setFirstOnPage(String firstOnPage) {
        this.firstOnPage = firstOnPage;
    }

    public String getLastOnPage() {
        return lastOnPage;
    }

    public void setLastOnPage(String lastOnPage) {
        this.lastOnPage = lastOnPage;
    }
}
