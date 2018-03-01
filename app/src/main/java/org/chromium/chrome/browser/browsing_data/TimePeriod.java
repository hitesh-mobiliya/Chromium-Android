
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/browsing_data/core/browsing_data_utils.h

package org.chromium.chrome.browser.browsing_data;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TimePeriod.LAST_HOUR, TimePeriod.LAST_DAY, TimePeriod.LAST_WEEK, TimePeriod.FOUR_WEEKS,
    TimePeriod.ALL_TIME, TimePeriod.OLDER_THAN_30_DAYS, TimePeriod.TIME_PERIOD_LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface TimePeriod {
  int LAST_HOUR = 0;
  int LAST_DAY = 1;
  int LAST_WEEK = 2;
  int FOUR_WEEKS = 3;
  int ALL_TIME = 4;
  int OLDER_THAN_30_DAYS = 5;
  int TIME_PERIOD_LAST = 5;
}
