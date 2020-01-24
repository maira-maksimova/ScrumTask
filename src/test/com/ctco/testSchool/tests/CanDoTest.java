package com.ctco.testSchool.tests;

import com.ctco.testSchool.Member;
import com.ctco.testSchool.Story;
import com.ctco.testSchool.Team;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanDoTest {
    Team myTeam = new Team();


    @Test
    public void happyPathCanDoTest(){
        Story story = new Story();

        myTeam.backlog = Arrays.asList(story);
        Assert.assertTrue(myTeam.canDo());
    }

    @Test
    public void oneStoryTest(){
        Member member = new Member();

        Story story = new Story();
        story.setStoryPoints(1);
        myTeam.backlog = Arrays.asList(story);

        Assert.assertFalse(myTeam.canDo());
        myTeam.addMember(member);
        Assert.assertTrue(myTeam.canDo());
    }

}
