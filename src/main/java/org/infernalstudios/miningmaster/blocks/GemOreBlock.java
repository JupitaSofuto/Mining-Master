/*
 * Copyright 2022 Infernal Studios
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

package org.infernalstudios.miningmaster.blocks;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;

public class GemOreBlock extends DropExperienceBlock {
    public GemOreBlock(Properties p_221083_, IntProvider p_221084_) {
        super(p_221083_, p_221084_);
    }

    // TRAILING COMMENT TO KEEP
    // ORIGINAL LINE NUMBER NODES
    public GemOreBlock(Properties properties) {
        super(properties, UniformInt.of(5, 10));
    }
}
