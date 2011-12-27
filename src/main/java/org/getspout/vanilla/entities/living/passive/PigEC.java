package org.getspout.vanilla.entities.living.passive;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entities.AnimalEC;
import org.getspout.vanilla.entities.PassiveEC;
import org.getspout.vanilla.mobs.MobID;

public class PigEC extends AnimalEC implements PassiveEC {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata("MobID", new MetadataStringValue(MobID.Pig.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}

}