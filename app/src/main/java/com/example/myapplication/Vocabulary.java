package com.example.myapplication;


//this is not abstracted not allowed to override it because it's full implemnted class
public class Vocabulary {

    //----------------section of data----------------
    private String mArabicTranslations;
    private String mEnglishTranslation;
    //----------------end of the data section ----------------

    // ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||//
    //----------------section of building a constructor----------------
    public Vocabulary(String Arabic , String English){
        mArabicTranslations = Arabic;
        mEnglishTranslation = English;
    };

    //end of the constructors section
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||//
    //----------------sECTION OF Getters----------------
    public String getEnglish(){
        return mEnglishTranslation;
    };
    public String getArabic(){
        return mArabicTranslations;
    };
    //end of the Getters sections
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||//
    //----------------sECTION OF Setters----------------
    public void SetEnglishTranslate(String english){
        mEnglishTranslation = english;
    };

    public void setArabicTranslate(String arabic){
        mArabicTranslations = arabic;
    };
    //end of the setters functions

}
