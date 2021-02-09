package es.eduardsanz.ejercicio3;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import es.eduardsanz.ejercicio3.POJO.Usuario;

public class ResponseUsers {
    private long page;
    @SerializedName("per_page")
    private long perPage;
    private long total;
    @SerializedName("total_pages")
    private long totalPages;
    private List<Usuario> data;

    public ResponseUsers(long page, long perPage, long total, long totalPages, List<Usuario> data) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPerPage() {
        return perPage;
    }

    public void setPerPage(long perPage) {
        this.perPage = perPage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<Usuario> getData() {
        return data;
    }

    public void setData(List<Usuario> data) {
        this.data = data;
    }
}
