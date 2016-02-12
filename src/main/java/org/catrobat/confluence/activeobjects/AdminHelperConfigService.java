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

import com.atlassian.activeobjects.tx.Transactional;

import java.util.List;

@Transactional
public interface AdminHelperConfigService {

  AdminHelperConfig getConfiguration();

  Team addTeam(String teamName, List<String> coordinatorGroups,
               List<String> seniorGroups, List<String> developerGroups, List<String> teamCategoryNames);

  AdminHelperConfig editTeam(String oldTeamName, String newTeamName);

  AdminHelperConfig removeTeam(String teamName);

  AdminHelperConfig editMail(String mailFromName, String mailFrom, String mailSubject, String mailBody);

  List<String> getGroupsForRole(String teamName, TeamToGroup.Role role);

  List<String> getCategoryNamesForTeam(String teamName);

  int[] getCategoryIDsForTeam(String teamName);

  boolean isGroupApproved(String groupName);

  boolean isUserApproved(String userKey);

  ApprovedGroup addApprovedGroup(String approvedGroupName);

  AdminHelperConfig removeApprovedGroup(String approvedGroupName);

  ApprovedUser addApprovedUser(String approvedUserKey);

  AdminHelperConfig removeApprovedUser(String approvedUserKey);

  void clearApprovedGroups();

  void clearApprovedUsers();
}
