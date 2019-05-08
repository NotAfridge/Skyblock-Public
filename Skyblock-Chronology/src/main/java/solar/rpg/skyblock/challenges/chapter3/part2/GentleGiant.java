package solar.rpg.skyblock.challenges.chapter3.part2;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import solar.rpg.skyblock.island.Island;
import solar.rpg.skyblock.island.chronology.Chronicle;
import solar.rpg.skyblock.island.chronology.criteria.Criteria;
import solar.rpg.skyblock.island.chronology.criteria.item.ItemCrit;
import solar.rpg.skyblock.island.chronology.criteria.item.Multiple;
import solar.rpg.skyblock.island.chronology.criteria.item.Single;
import solar.rpg.skyblock.island.chronology.reward.Reward;
import solar.rpg.skyblock.island.chronology.reward.TrailReward;

import java.util.UUID;

public class GentleGiant extends Chronicle {

    public String getName() {
        return "Gentle Giant";
    }

    public Criteria[] getCriteria() {
        return new Criteria[]{new ItemCrit(new Multiple(Material.ICE, 8),
                new Multiple(Material.QUARTZ_ORE, 4),
                new Multiple(Material.COAL_ORE, 2),
                new Multiple(Material.LAPIS_ORE, 2),
                new Multiple(Material.REDSTONE_ORE, 2),
                new Multiple(Material.IRON_ORE, 1),
                new Multiple(Material.GOLD_ORE, 1),
                new Single(Material.DIAMOND_ORE, 48),
                new Single(Material.EMERALD_ORE, 24)
        )};
    }

    public Reward[] getReward() {
        return new Reward[]{
                new TrailReward("Silky"),
                new Reward() {
                    public void reward(Island island, UUID toReward) {
                        island.aeon().add(6);
                    }

                    public String getReward() {
                        return "Empowers your Aeon Block with Packed Ice";
                    }
                }
        };
    }

    public ItemStack getIcon() {
        return new ItemStack(Material.BOOK);
    }

    public boolean isRepeatable() {
        return false;
    }
}