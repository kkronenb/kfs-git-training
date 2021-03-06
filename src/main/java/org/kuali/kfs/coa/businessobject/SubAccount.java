/*
 * The Kuali Financial System, a comprehensive financial management system for higher education.
 * 
 * Copyright 2005-2014 The Kuali Foundation
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kuali.kfs.coa.businessobject;

import java.util.LinkedHashMap;

public class SubAccount {
    private String chartOfAccountsCode;
    private String accountNumber;
    private String subAccountNumber;
    private String subAccountName;
    private boolean active;
    private String financialReportChartCode;
    private String finReportOrganizationCode;
    private String financialReportingCode;

    private Account account;
    private Chart chart;
    private Organization org;
    private Chart financialReportChart;

    // Several kinds of Dummy Attributes for dividing sections on Inquiry page
    private String financialReportingCodeSectionBlank;
    private String financialReportingCodeSection;
    private String cgCostSharingSectionBlank;
    private String cgCostSharingSection;
    private String cgICRSectionBlank;
    private String cgICRSection;

    /**
     * Gets the accountNumber attribute.
     * 
     * @return Returns the accountNumber.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the accountNumber attribute value.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the chartOfAccountsCode attribute.
     * 
     * @return Returns the chartOfAccountsCode.
     */
    public String getChartOfAccountsCode() {
        return chartOfAccountsCode;
    }

    /**
     * Sets the chartOfAccountsCode attribute value.
     * 
     * @param chartOfAccountsCode The chartOfAccountsCode to set.
     */
    public void setChartOfAccountsCode(String chartOfAccountsCode) {
        this.chartOfAccountsCode = chartOfAccountsCode;
    }

    /**
     * Gets the subAccountName attribute.
     * 
     * @return Returns the subAccountName
     */
    public String getSubAccountName() {
        return subAccountName;
    }

    /**
     * Sets the subAccountName attribute.
     * 
     * @param subAccountName The subAccountName to set.
     */
    public void setSubAccountName(String subAccountName) {
        this.subAccountName = subAccountName;
    }

    /**
     * Gets the active attribute.
     * 
     * @return Returns the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the active attribute.
     * 
     * @param active The active to set.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Gets the account attribute.
     * 
     * @return Returns the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the account attribute.
     * 
     * @param account The account to set.
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Gets the subAccount attribute.
     * 
     * @return Returns the subAccount
     */
    public String getSubAccountNumber() {
        return subAccountNumber;
    }

    /**
     * Sets the subAccount attribute.
     * 
     * @param subAccountNumber The subAccount to set.
     */
    public void setSubAccountNumber(String subAccountNumber) {
        this.subAccountNumber = subAccountNumber;
    }

    /**
     * @return Returns the financialReportChartCode.
     */
    public String getFinancialReportChartCode() {
        return financialReportChartCode;
    }

    /**
     * @param financialReportChartCode The financialReportChartCode to set.
     */
    public void setFinancialReportChartCode(String financialReportChartCode) {
        this.financialReportChartCode = financialReportChartCode;
    }

    /**
     * @return Returns the financialReportingCode.
     */
    public String getFinancialReportingCode() {
        return financialReportingCode;
    }

    /**
     * @param financialReportingCode The financialReportingCode to set.
     */
    public void setFinancialReportingCode(String financialReportingCode) {
        this.financialReportingCode = financialReportingCode;
    }

    /**
     * @return Returns the finReportOrganizationCode.
     */
    public String getFinReportOrganizationCode() {
        return finReportOrganizationCode;
    }

    /**
     * @param finReportOrganizationCode The finReportOrganizationCode to set.
     */
    public void setFinReportOrganizationCode(String finReportOrganizationCode) {
        this.finReportOrganizationCode = finReportOrganizationCode;
    }

    /**
     * @return Returns the chart.
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * @param chart The chart to set.
     * @deprecated
     */
    public void setChart(Chart chart) {
        this.chart = chart;
    }

    /**
     * @return Returns the financialReportChart.
     */
    public Chart getFinancialReportChart() {
        return financialReportChart;
    }

    /**
     * @param financialReportChart The financialReportChart to set.
     * @deprecated
     */
    public void setFinancialReportChart(Chart financialReportChart) {
        this.financialReportChart = financialReportChart;
    }

    /**
     * @return Returns the org.
     */
    public Organization getOrg() {
        return org;
    }

    /**
     * @param org The org to set.
     * @deprecated
     */
    public void setOrg(Organization org) {
        this.org = org;
    }

    protected LinkedHashMap toStringMapper_RICE20_REFACTORME() {
        LinkedHashMap m = new LinkedHashMap();
        m.put("chartCode", this.chartOfAccountsCode);
        m.put("account", this.accountNumber);
        m.put("subAccountNumber", this.subAccountNumber);
        return m;
    }

    /**
     * Gets the cGCostSharingSectionBlank attribute.
     * 
     * @return Returns the cGCostSharingSectionBlank.
     */
    public String getCgCostSharingSectionBlank() {
        return cgCostSharingSectionBlank;
    }

    /**
     * Gets the cGICRSectionBlank attribute.
     * 
     * @return Returns the cGICRSectionBlank.
     */
    public String getCgICRSectionBlank() {
        return cgICRSectionBlank;
    }

    /**
     * Gets the financialReportingCodeSectionBlank attribute.
     * 
     * @return Returns the financialReportingCodeSectionBlank.
     */
    public String getFinancialReportingCodeSectionBlank() {
        return financialReportingCodeSectionBlank;
    }

    /**
     * Gets the cGCostSharingSection attribute.
     * 
     * @return Returns the cGCostSharingSection.
     */
    public String getCgCostSharingSection() {
        return cgCostSharingSection;
    }

    /**
     * Gets the cGICRSection attribute.
     * 
     * @return Returns the cGICRSection.
     */
    public String getCgICRSection() {
        return cgICRSection;
    }

    /**
     * Gets the financialReportingCodeSection attribute.
     * 
     * @return Returns the financialReportingCodeSection.
     */
    public String getFinancialReportingCodeSection() {
        return financialReportingCodeSection;
    }
}
