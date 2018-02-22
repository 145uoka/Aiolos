package com.glue_si.aiolos.form.genre;

import org.hibernate.validator.constraints.NotEmpty;

import com.glue_si.aiolos.common.beanvalidation.Number;

public abstract class AbstractGenreForm {

    /**
     * 必須
     */
    public interface RequireId {
    }

    /**
     * 登録時
     */
    public interface Register {
    }

    @Number
    @NotEmpty(groups = RequireId.class)
    private String genreId;

    @NotEmpty(groups = Register.class)
    private String genreName;

    private String deleteFlag;

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }


}
