@OAMSCases
Feature: OAMS Application
  As we are covering OAMS feature file as Facilities Management

  Background:
   # Given I have logged into sharepoint

  #TCV Effort Days < 100 Effort Days > 100
  #Cat C Cat B Cat A Cat C Cat B Cat A
  #>50K   3 3 3 3 3 3
  #<500K  3 3 2 3 2 1
  #<1000K 3 2 2 2 2 2
  #>1000K 1 1 1 1 1 1

  @TC001_CategoryALessThan25   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
      And I click on OAM menu from side bar
      And I click on New opportunity approval request
      And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
      And I click the on the Save Button
      And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeA>
      And I click on Respective Records and click on edit button for approver requires
      And Provided the required approvers as <Approver>
      And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeA>
      And I click on Respective Records and click on edit button for approver requires
      And Provide the require approvers for Development Request <ApprovalType3>
      And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeA>
      And I click on Respective Records and click on edit button for approver requires
      And Relese RequestApprovers on the basis of effrtDays and tcv valueTC01 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
      And I click on filter option for approved
      And I select the Approved filter criteria
      Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
     # Then I Verify the respective Records for Approval <OVERALLStatus>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeA|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category A|<25 days|1000001|Opportunity Sign On|Category A| Opportunity In Development|Approved|Opportunity Release Request|

  @TC002_CategoryAGreaterThan25AndLessThan40   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv value <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #And I Verify the respective Records for Approval <OVERALLStatus>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeA|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category A|>25<40 days|20000|Opportunity Sign On|Category A| Opportunity In Development|Approved|Opportunity Release Request|


  @TC003_CategoryAGreaterThan40AndLessThan100   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv value <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #And I Verify the respective Records for Approval <OVERALLStatus>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeA|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category A|>40<100 days|20000|Opportunity Sign On|Category A| Opportunity In Development|Approved|Opportunity Release Request|

  @TC004_CategoryAGreaterThan100Days   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeA>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC04 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #And I Verify the respective Records for Approval <OVERALLStatus>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeA|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category A|>100 days|30000|Opportunity Sign On|Category A| Opportunity In Development|Approved|Opportunity Release Request|

   # Category Type B:  below cases are Catoegory type B.

  @TC005_CategoryBLessThan25  #failed
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC05 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category B|<25 days|1000001|Opportunity Sign On|Category B| Opportunity In Development|Approved|Opportunity Release Request|

  @TC006_CategoryBGreaterThan25AndLessThan40 #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC06 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category B|>25<40 days|250000|Opportunity Sign On|Category B| Opportunity In Development|Approved|Opportunity Release Request|


  @TC007_CategoryBGreaterThan40AndLessThan100 #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC06 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category B|>40<100 days|60000|Opportunity Sign On|Category B| Opportunity In Development|Approved|Opportunity Release Request|


  @TC008_CategoryBGreaterThanHundred   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC08 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category B|>100 days|200033|Opportunity Sign On|Category B| Opportunity In Development|Approved|Opportunity Release Request|

    # Category Type C: Below cases are Category Type C


  @TC009_CategoryCLessThan25   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required approvers as <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC09 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category C|<25 days|1000001|Opportunity Sign On|Category C| Opportunity In Development|Approved|Opportunity Release Request|

  @TC0010_CategoryCGreaterThan25AndLessThan40  #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required for CategoryC <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC10 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category C|>25<40 days|250000|Opportunity Sign On|Category C| Opportunity In Development|Approved|Opportunity Release Request|


  @TC011_CategoryCGreaterThan40AndLessThan100   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required for CategoryC <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC10 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category C|>40<100 days|60000|Opportunity Sign On|Category C| Opportunity In Development|Approved|Opportunity Release Request|

  @TC012_CategoryCGreaterThanHundred   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And I Provided the required for CategoryC <Approver>
    And Verify the respective Records for Approval and <ApprovalTypeLevel2> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeB>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC12 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeB|ApprovalTypeLevel2|Approver|ApprovalType3|
      |Category C|>100 days|200033|Opportunity Sign On|Category C| Opportunity In Development|Approved|Opportunity Release Request|

        # Category Type Exemption: Below cases are Category Type Exemption


  @TC013_CategoryExemptionLessThan25  #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category Exemption and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC13 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeExemption|Approver|ApprovalType3|
      |Exemption|<25 days|1000001|Opportunity In Development|Exemption|Approved|Opportunity Release Request|



  @TC0014_CategoryExemptionGreaterThan25AndLessThan40  #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC13 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeExemption|Approver|ApprovalType3|
      |Exemption|>25<40 days|250000|Opportunity In Development|Exemption|Approved|Opportunity Release Request|



  @TC015_CategoryExemptionGreaterThan40AndLessThan100   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category A and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC13 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeExemption|Approver|ApprovalType3|
      |Exemption|>40<100 days|60000|Opportunity In Development|Exemption|Approved|Opportunity Release Request|


  @TC016_CategoryExemptionGreaterThanHundred   #done
  Scenario Outline: Verify to Create OAMS New Apportunity approval request for Category Exmeption and Estimated Effort less than twenty five days
    Given I have logged in full permission user model AdminRights
    And I click on OAM menu from side bar
    And I click on New opportunity approval request
    And Fill the OAMS New Opportunity Details for Category <CategoryType> and required effort day as <effortDay> and <RevenueVal>
    And I click the on the Save Button
    And Verify the respective Records for Approval and <ApprovalTypeLevel1> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Provide the require approvers for Development Request <ApprovalType3>
    And Verify the respective Records for Approval and <ApprovalType3> and CategoryType is <CategoryTypeExemption>
    And I click on Respective Records and click on edit button for approver requires
    And Relese RequestApprovers on the basis of effrtDays and tcv valueTC13 <CategoryType>,<effortDay> and <RevenueVal> and <Approver>
    And I click on filter option for approved
    And I select the Approved filter criteria
    Then I verify the App Level Criteria on the basis of <CategoryType>,<effortDay> and <RevenueVal>
    #Then Verify the respective Records for Approval and <OVERALLStatus> and CategoryType is <SignOFLevel>
    Examples:
      | CategoryType |effortDay|RevenueVal|ApprovalTypeLevel1|CategoryTypeExemption|Approver|ApprovalType3|
      |Exemption|>100 days|200033| Opportunity In Development|Exemption|Approved|Opportunity Release Request|