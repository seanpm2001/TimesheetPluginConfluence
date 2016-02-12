/*
 * Copyright 2016 Adrian Schnedlitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.catrobat.confluence.activeobjects;

import net.java.ao.Entity;
import net.java.ao.OneToMany;

public interface Timesheet extends Entity {

  String getUserKey();

  void setUserKey(String key);

  int getTargetHoursPractice();

  void setTargetHoursPractice(int hours);

  int getTargetHoursTheory();

  void setTargetHoursTheory(int hours);

  boolean getIsActive();

  void setIsActive(boolean isActive);

  String getLecture();

  void setLecture(String lecture);

  @OneToMany(reverse = "getTimeSheet")
  TimesheetEntry[] getEntries();

}