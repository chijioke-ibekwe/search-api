package com.mightwork.searchapi.exception;

public class SearchDataFormatException extends RuntimeException
{
    public SearchDataFormatException(String message)
    {
        super(message);
    }


    public SearchDataFormatException(Exception e)
    {
        super(e);
    }


}
