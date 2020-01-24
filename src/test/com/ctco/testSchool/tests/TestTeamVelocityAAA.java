package com.ctco.testSchool.tests;

import com.ctco.testSchool.Member;
import com.ctco.testSchool.Team;
import org.junit.Assert;
import org.junit.Test;

public class TestTeamVelocityAAA {
    Team myTeam = new Team();

    @Test
    public void emptyTeamTest() {
        Assert.assertEquals("Empty team has zero velicity", 0.0, myTeam.getTeamVelocity(), 0.1);
    }

    @Test
    public void happyPathTest() {
        Member member = new Member();
        myTeam.addMember(member);
        Assert.assertEquals("By default my velocity is 1 per 10 days of sprint", 10.0, myTeam.getTeamVelocity(), 0.1);
    }

    @Test
    public void customSprintLength() {
        Member member = new Member();
        myTeam.addMember(member);
        myTeam.sprintDays = 9;
        Assert.assertEquals("Sprint is 9 days long", 9.0, myTeam.getTeamVelocity(), 0.1);
    }

    @Test
    public void threeMembers() {
        Member member1 = new Member();
        member1.velocity = 0.5;
        Member member2 = new Member();
        Member member3 = new Member();
        myTeam.addMember(member1);
        myTeam.addMember(member2);
        myTeam.addMember(member3);
        Assert.assertEquals( 25, myTeam.getTeamVelocity(), 0.1);
    }
}
