package com.android.app.devops.addin_mobiledemo;


public class DataModel {

    String _locationName,_postId,_date,_word;
    int _imageName;

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public String get_word() {
        return _word;
    }

    public void set_word(String _word) {
        this._word = _word;
    }

    public DataModel(String _locationName, int _imageName, String _postId, String _date, String _word) {
        this._locationName = _locationName;
        this._imageName = _imageName;
        this._postId = _postId;
        this._date = _date;
        this._word = _word;
    }

    public String get_locationName() {
        return _locationName;
    }

    public void set_locationName(String _locationName) {
        this._locationName = _locationName;
    }

    public int get_imageName() {
        return _imageName;
    }

    public void set_imageName(int _imageName) {
        this._imageName = _imageName;
    }

    public String get_postId() {
        return _postId;
    }

    public void set_postId(String _postId) {
        this._postId = _postId;
    }
}
