
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
System.out.println(campaign.getName()+" kampanyasý baþarýyla eklenmiþtir.");		
	}

	@Override
	public void delete(Campaign campaign) {
System.out.println(campaign.getName()+ " kampanyasý baþarýyla silinmiþtir.");		
	}

	@Override
	public void update(Campaign campaign) {
System.out.println(campaign.getName()+" kampanyasý baþarýyla güncellenmiþtir.");		
	}

}
