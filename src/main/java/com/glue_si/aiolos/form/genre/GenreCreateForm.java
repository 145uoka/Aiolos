package com.glue_si.aiolos.form.genre;

import org.hibernate.validator.constraints.NotEmpty;

public class GenreCreateForm {

    @NotEmpty
    private String genreName;

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }


}
