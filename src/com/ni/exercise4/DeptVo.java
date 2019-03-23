package com.ni.exercise4;

import java.util.List;

public class DeptVo {
    private String deptName;// 部门名称
    private List emps;// 部门员工集合

    public DeptVo(String deptName, List emps) {
        this.deptName = deptName;
        this.emps = emps;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List getEmps() {
        return emps;
    }

    public DeptVo() {
    }

    @Override
    public String toString() {
        return "DeptVo{" +
                "deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public void setEmps(List emps) {
        this.emps = emps;
    }

    public void printDep()
    {
        System.out.println("部门信息："+"\n"+this.toString());
    }
}
