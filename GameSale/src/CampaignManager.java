
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
System.out.println(campaign.getName()+" kampanyası başarıyla eklenmiştir.");		
	}

	@Override
	public void delete(Campaign campaign) {
System.out.println(campaign.getName()+ " kampanyası başarıyla silinmiştir.");		
	}

	@Override
	public void update(Campaign campaign) {
System.out.println(campaign.getName()+" kampanyası başarıyla güncellenmiştir.");		
	}

}
