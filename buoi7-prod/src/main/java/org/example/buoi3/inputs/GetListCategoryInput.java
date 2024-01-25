package org.example.buoi3.inputs;

public class GetListCategoryInput {
    private String name;
    private Integer page;
    private Integer size;

    public GetListCategoryInput() {
    }

    public GetListCategoryInput(String name, Integer page, Integer size) {
        this.name = name;
        this.page = page;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
