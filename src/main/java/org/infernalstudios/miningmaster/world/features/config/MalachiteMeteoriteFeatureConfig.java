/*
 * Copyright 2021 Infernal Studios
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

package org.infernalstudios.miningmaster.world.features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public record MalachiteMeteoriteFeatureConfig(int minRadius, int maxRadius, int chanceToGenerate) implements FeatureConfiguration {
    public static final Codec<MalachiteMeteoriteFeatureConfig> CODEC = RecordCodecBuilder.create((builder) -> builder.group(
            Codec.INT.fieldOf("min_radius").forGetter(MalachiteMeteoriteFeatureConfig::minRadius),
            Codec.INT.fieldOf("max_radius").forGetter(MalachiteMeteoriteFeatureConfig::maxRadius),
            Codec.INT.fieldOf("chance_to_generate").forGetter(MalachiteMeteoriteFeatureConfig::chanceToGenerate))
        .apply(builder, MalachiteMeteoriteFeatureConfig::new));

}
