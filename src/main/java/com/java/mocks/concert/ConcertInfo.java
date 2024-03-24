package com.java.mocks.concert;

import com.java.mocks.clock.ConcertData;

import java.util.Date;

public interface ConcertInfo {

    ConcertData getConcertInfoForDate(Date date);
}
