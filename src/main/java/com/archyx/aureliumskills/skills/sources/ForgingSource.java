package com.archyx.aureliumskills.skills.sources;

import com.archyx.aureliumskills.skills.Skill;
import com.archyx.aureliumskills.skills.Skills;

public enum ForgingSource implements Source {
    
    COMBINE_BOOKS_PER_LEVEL,
    COMBINE_WEAPON_PER_LEVEL,
    COMBINE_ARMOR_PER_LEVEL,
    COMBINE_TOOL_PER_LEVEL,
    GRINDSTONE_PER_LEVEL;

    @Override
    public Skill getSkill() {
        return Skills.FORGING;
    }
}
